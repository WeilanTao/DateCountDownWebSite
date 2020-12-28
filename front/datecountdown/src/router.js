import { createRouter, createHistory } from 'vue-router';

import UserAuth from '.components/UserAuth.vue';
import DateList from '.components/DateList.vue';
import date from '.components/Date.vue';
import NotFound from '.components/NotFound.vue';

const router=createRouter({
    history: createHistory(),
    routes:[
        {path:'/', redirect:'/userauth'},
        {path:'/userauth', component:UserAuth},
        {path:'/datelist/:date', component:DateList,
        children:[
                {
                    path:'date', component:date
                }
            ]
        },
        {path:'/:notFound(.*)', component:NotFound},

    ],
});

export default router;