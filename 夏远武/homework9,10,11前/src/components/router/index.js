import Vue from "vue";
import VueRouter from "vue-router";
import User from "@/views/User.vue";
import NotFound from "@/components/views/ NotFound.vue";
import Login from "@/components/views/Login.vue";
import Home from "@/components/views/Home.vue";

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
        path: "*", //匹配上述两条规则之外的所有路径
        component: NotFound
    }
    ]
const router = new VueRouter({
    routes: routes //在 VueRouter 实例中使用该路由规则数组
});

export default router;
