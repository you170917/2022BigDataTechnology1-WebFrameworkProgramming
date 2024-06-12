import './assets/main.css'
import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import * as Icons from '@ant-design/icons-vue'
import Vue from 'vue'
import {deleteRequest, getRequest, postKeyValueRequest, postRequest, putRequest} from "@/utils/api";
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
const app = createApp(App)

app.use(router)
const icons  = Icons
for (const i in icons) {
    app.component(i, icons[i])
}
app.use(ElementPlus)
app.mount('#app')


Vue.use(ElementUI);
Vue.config.productionTip = false
Vue.prototype.getRequest = getRequest;
Vue.prototype.postRequest = postRequest;
Vue.prototype.putRequest = putRequest;
Vue.prototype.deleteRequest = deleteRequest;
Vue.prototype.postKeyValueRequest = postKeyValueRequest;

new Vue({
    render: h => h(App),
    router
}).$mount('#app')
