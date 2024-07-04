import axios from"axios";
export const getRequest = (url) =>{
    let baseUrl;
    return axios({
        method:"get",
        url:`${baseUrl}${url}`,

    })
}
// 封装 POST 请求
export const postRequest = (url, params) => {
    let baseUrl;
    return axios({
        method: "post",
        url: `${baseUrl}${url}`,
        data: params
    })
}
// 封装 PUT 请求
export const putRequest = (url, params) => {
    let baseUrl;
    return axios({
        method: "put",
        url: `${baseUrl}${url}`,
        data: params
    })
}
// 封装 DELETE 请求
// 该请求接收查询参数,这里需要使用 params 参数
export const deleteRequest = (url, params) =>{
    let baseUrl;
    return axios({
        method: "delete",
        url: `${baseUrl}${url}`,
        params: params, //该请求接收查询参数,这里需要使用 params 参数
    })
}

