import Vue from "vue";
import VueRouter from "vue-router";
import User from "@/views/User.vue";
import NotFound from "@/views/NotFound.vue";
import myUser from "@/views/MyUser.vue";
import Home from "@/views/Home.vue";

Vue.use(VueRouter);
const routes = [
    {
        path: "/",
        redirect:"/Home"
    },

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
        component: myUser
    },{
    path: "home",
        component: Home
    }

]
const router = new VueRouter({
    routes: routes //在 VueRouter 实例中使用该路由规则数组
});
export default router;