import Vue from 'vue';
import Router from 'vue-router';

import UserAuth from '@/pages/UserAuth';
import DateList from '@/pages/DateList';
import NotFound from '@/pages/NotFound';
// import DateCount from '@/pages/DateCount';


Vue.use(Router)

const router = new Router({
    // mode:'history',
    // base:process.env.BASE_URL,
    routes:[
        {
            path:'/',
            name:'userauth',
            component:UserAuth
        },{
            path:'/datelist',
            name:'datelist',
            component:DateList,
        },{
            path:'/notfound',
            name:'notfound',
            component:NotFound
        }
    ]
})

export default router;