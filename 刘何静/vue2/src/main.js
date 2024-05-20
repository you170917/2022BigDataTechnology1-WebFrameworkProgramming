import './assets/main.css'

import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import * as Icons from '@ant-design/icons-vue'
const app = createApp(App)

app.use(router)
const icons  = Icons
for (const i in icons) {
    app.component(i, icons[i])
}
app.use(ElementPlus)
app.mount('#app')
