import Vue from "vue"; //导入 Vue 模块
import VueRouter from "vue-router"; // 第二步：导入 VueRouter 模块

Vue.use(VueRouter); //第三步：Vue.use 安装注册
const routes = [ //定义一个路由规则数组
    {
        path: "/home", //访问路径
        component: Home //对应的组件
    },
    {
        path: "/",
        component: Login
    },
]
const router = new VueRouter({ //第四步：创建 VueRouter 对象
});
export default router; //导出此模块