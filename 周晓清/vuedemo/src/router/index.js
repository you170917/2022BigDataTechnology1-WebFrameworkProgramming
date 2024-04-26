import Vue from "vue"; //导入 Vue 模块
import VueRouter from "vue-router"; // 第二步：导入 VueRouter 模块
Vue.use(VueRouter); //第三步：Vue.use 安装注册
const router = new VueRouter({ //第四步：创建 VueRouter 对象
});
export default router; //导出此模块

import Vue from "vue";
import VueRouter from "vue-router";
import User from "@/views/User.vue";
Vue.use(VueRouter);
const routes = [ //定义一个路由规则数组
    {
        path: "/user", //访问路径
        component: User //对应的组件
    }
]
const router = new VueRouter({
    routes: routes //在 VueRouter 实例中使用该路由规则数组
});
export default router;