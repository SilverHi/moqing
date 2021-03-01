import { post } from './http'
export const login = p => post('user-login/login', p)
export const test = p => post('user-login/test', p)
