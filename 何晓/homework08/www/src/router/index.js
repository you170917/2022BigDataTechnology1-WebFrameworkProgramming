import { createRouter, createWebHistory } from 'vue-router'


const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/user",
      component: User
    },
    {
      path: "/",
      component: Home
    },
    {
      path: "*",
      component: NotFound
    },
    {
      path: "/myUser",
      component: MyUser
    }
  ]
})

export default router
