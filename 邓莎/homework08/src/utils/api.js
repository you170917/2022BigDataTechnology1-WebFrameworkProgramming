import axios from "axios";

let baseUrl = "http://localhost:8081";

export const getRequest = (url,params) => {
    return axios({
        method: "get",
        url: '${baseUrl}${rul}',
        data: params
    })
}

export const postRequest = (url,params) => {
    return axios({
        method: "post",
        url: '${baseUrl}${rul}',
        data: params
    })
}

export const putRequest = (url, params) => {
    return axios({
        method: "put",
        url: '${baseUrl}${url}',
        data: params
    })
}


export const deleteRequest = (url,params) => {
    return axios({
        method: "delete",
        url: '${baseUrl}${rul}',
        data: params,
    })
}