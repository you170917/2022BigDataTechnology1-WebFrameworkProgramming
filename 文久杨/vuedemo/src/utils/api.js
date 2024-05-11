import axios from "axios";
const baseUrl= "/api";
// 封装 GET 请求
export const getRequest = async (url, params) => {
    return await axios.get(baseUrl + url, params)
}
// 封装 POST 请求
export const postRequest = async (url, params) => {
    // return axios({
    //     method: "post",
    //     url: `${baseUrl}${url}`,
    //     data: params
    // })
    return await axios.post(baseUrl + url, params)

}
// 封装 PUT 请求
export const putRequest = async (url, params) => {
    // return axios({
    //     method: "put",
    //     url: `${baseUrl}${url}`,
    //     data: params
    // })
    return await axios.put(baseUrl + url, params)

}
// 封装 DELETE 请求
// 该请求接收查询参数,这里需要使用 params 参数
export const deleteRequest = async (url, params) => {
    // return axios({
    //     method: "delete",
    //     url: `${baseUrl}${url}`,
    //     params: params, //该请求接收查询参数,这里需要使用 params 参数
    // })
    return await axios.delete(baseUrl + url, params)

}