import Vue from "vue";
import VueRouter from "vue-router";
import User from "@/views/User.vue";
import NotFound from "@/views/NotFound.vue";
Vue.use(VueRouter);
const routes = [
    {
        path:"/user",
        component: User
    },
    {
        path:"/",
        redirect:"/user"
    },
    {
        path:"*",
        component: NotFound
    },
    {
        path: "/",
        component:()=>import("@/views/Home.vue")
    }
]
const router = new VueRouter({
    routes: routes
});
export default router;