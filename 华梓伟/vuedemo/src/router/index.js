import Vue from "vue";
import VueRouter from "vue-router";
import User from "@/views/User.vue";
import NotFound from "@/views/NotFound.vue";
import MyUser from "@/views/MyUser.vue";
import Login from "@/views/Login.vue";
import Home from "@/views/Home.vue";

Vue.use(VueRouter);
const routes = [ //定义一个路由规则数组

    {
        path: "/user",
        component: User
    },
    {
        path: "*",
        component: NotFound
    },
    {
        path: "/myUser",
        component: MyUser
    },
    {
        path: "/home",
        component: Home
    },
    {
        path: "/",
        component: Login
    }

]
const router = new VueRouter({
    routes: routes //在 VueRouter 实例中使用该路由规则数组
});
export default router;