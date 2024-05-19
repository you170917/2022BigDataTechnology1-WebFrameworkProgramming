import Vue from "vue";
import VueRouter from "vue-router";
import User from "@/views/User.vue";
Vue.use(VueRouter);
const routes = [ //定义一个路由规则数组
    {
        path: "/user", //访问路径
        component: User //对应的组件
    },
    {
        path: "/",
        redirect:"/user"
    }
]
const router = new VueRouter({
    routes: routes //在 VueRouter 实例中使用该路由规则数组
});
export default router;