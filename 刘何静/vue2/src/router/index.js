import { createRouter, createWebHistory } from 'vue-router'
import Login from "@/views/Login.vue";
import Home from "@/views/Home.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    // {
    //   path: '/:pathMatch(.*)*',
    //   name: '404',
    //   component:()=>import("../views/NotFound.vue")
    // },
    // {
    //   path: "/",
    //   redirect: '/user'
    // },
    {
      path: '/user',
      name: 'user',
      component: () => import('../views/User.vue')
    },
    {
      path: "/home",
      name: "home",
      component:() => import("../views/Home.vue")
    },

    {
      path: "/myuser",
      name: "myuser",
      component:()=>import("../views/MyUser.vue")
    },
    {
      path:"/",
      name:"Login",
      component:()=>import("../views/Login.vue")
    }
  ]
})

export default router
