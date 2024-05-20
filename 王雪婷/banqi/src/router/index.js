import Vue from "vue";
import VueRouter from "vue-router";
import login from "@/login/login.vue";
import sucess from "@/login/sucess.vue";
import error from "@/login/error.vue";
Vue.use(VueRouter);
const routes = [ //定义一个路由规则数组
    {
        path: "/", //访问路径
        redirect:"/login"//对应的组件
    },
    {
        path: "/login", //访问路径
        component: login
    },
    {
        path: "/sucess",
        component:sucess
    },
    {
        path: "*", //匹配上述两条规则之外的所有路径
        component: error
    }

]
const router = new VueRouter({
    routes: routes //在 VueRouter 实例中使用该路由规则数组
});
export default router;