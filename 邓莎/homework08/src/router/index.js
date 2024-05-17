import Vue from "vue";

import VueRouter from "vue-router";
import User from "@/views/User.vue";
import NotFound from "@/views/NotFound.vue";
import Home from "@/views/Home.vue";
import myUser from "@/views/MyUser.vue";
Vue.use(VueRouter);
const router = new VueRouter({//第四步：创建 VueRouter 对象
    routes : [
        {
            path: "/",
            // component: Home
            component:()=>import("@/views/Home.vue")
        },
        {
            path:"/user",
            //component: User
            component:()=>import("@/views/User.vue")
        },
        {
            path: "*",
            // component: NotFound
            component:()=>import("@/views/NotFound.vue")
        },

        {
            path: "/myUser",
            // component: myUser
            component:()=>import("@/views/MyUser.vue")
        }

    ]
})

export default router; //导出此模块
