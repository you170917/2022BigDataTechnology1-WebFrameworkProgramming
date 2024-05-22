import Vue from "vue";
import VueRouter from "vue-router";
import User from "@/views/User.vue";
import NotFound from "@/views/NotFound.vue";
import myUser from "@/views/MyUser.vue";
import Home from "@/views/Home.vue";
import Login from "@/views/Login.vue";

Vue.use(VueRouter);

const routes = [
    {
        path: "/home",
        component: Home
    },
    {
        path: "/",
        component: Login
    },
    {
        path:"/myUser",
        component: myUser
    },
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