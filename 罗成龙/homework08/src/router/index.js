import Vue from "vue";
import VueRouter from "vue-router";
import User from "@/views/User.vue";
import NotFound from "@/views/NotFound.vue";
import MyUser from "@/views/MyUser.vue";

Vue.use(VueRouter);
const routers =[
    {
        path: "/myUser",
        component:MyUser
    },
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