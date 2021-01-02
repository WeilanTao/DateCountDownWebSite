import Vue from 'vue';
import Router from 'vue-router';

import UserAuth from '@/pages/UserAuth';
import DateList from '@/pages/DateList';
import NotFound from '@/pages/NotFound';
import SignUp from '@/pages/Signup';
import DateCount from '@/pages/DateCount';
import NewDate from  '@/components/NewDate';


Vue.use(Router)

const router = new Router({
    // mode:'history',
    // base:process.env.BASE_URL,
    routes:[
        {
            path:'/userauth',
            name:'userauth',
            component:UserAuth
        },{
            path:'/',
            redirect:'/userauth',
        },
        {
            path:'/signup',
            name:'signup',
            component:SignUp,
        },
        {
            path:'/datelist',
            name:'datelist',
            component:DateList,
            children:[
                {
                path:'datecount',
                name:'datecount',
                component:DateCount,
                },
              
            ]
        },
        {
            path:'/datelist',
            name:'datelist',
            component:DateList,
        },    

        // the pop out create/edit panel
        {
            path:'/datelist',
            name:'datelist',
            component:DateList,
            children:[
                {
                    // No slash perfix for the child path!!!
                    path:'newdate',
                    name:'newdate',
                    component:NewDate,
                },
              
            ]
        },
        {
            path:'/datelist/:dateid/datecount',
            name:'datecount',
            component:DateCount,
        },
        
        {
            path:'/notfound',
            name:'notfound',
            component:NotFound,
        }
    ]
})

export default router;