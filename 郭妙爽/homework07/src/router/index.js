import Vue from "vue";
import VueRouter from "vue-router";
import User from "@/views/User.vue";
import NotFound from "@/views/NotFound.vue";

Vue.use(VueRouter);
const routers =[
    {
    path: "/",
    redirect:"/user"
    },
    {
    path:"/user",
    component:User
    },
    {
    path: "*",
    component: NotFound
    }
]
const router = new VueRouter({
    routes:routers
});

export default router;