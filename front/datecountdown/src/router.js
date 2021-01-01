import Vue from 'vue';
import Router from 'vue-router';

import UserAuth from '@/pages/UserAuth';
import DateList from '@/pages/DateList';
import NotFound from '@/pages/NotFound';
import SignUp from '@/pages/Signup';
import DateCount from '@/pages/DateCount';


Vue.use(Router)

const router = new Router({
    // mode:'history',
    // base:process.env.BASE_URL,
    routes:[
        {
            path:'/',
            name:'userauth',
            component:UserAuth
        },
        {
            path:'/signup',
            name:'signup',
            component:SignUp
        },
        {
            path:'/datelist',
            name:'datelist',
            component:DateList,
        },
        {
            path:'/datecount',
            name:'datecount',
            component:DateCount,
        },
        {
            path:'/notfound',
            name:'notfound',
            component:NotFound
        }
    ]
})

export default router;