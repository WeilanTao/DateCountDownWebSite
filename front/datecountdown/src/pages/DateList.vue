<template>
    <body>
        <div class="wrapper">
            <div class="row1">
                <p>Welcome! Emily</p>
            </div>
            <div class="row2">
                <div class="column">
                    <p class="title">New Date</p>
                </div>  
                <div class="column"> 
                    <p class="title">Date List</p>
                </div>
            </div>
            <div class="row3">
                <div class="column">
                    <form>
                        
                        <input type="text" placeholder="Name of the Date">
                        <!-- <input type="text" placeholder="Year"> -->
                        <input type="text" placeholder="Month">
                        <input type="text" placeholder="Date">
                        <div class="row4">
                            <router-link to="/datelist/newdate" class="button">Clear</router-link>

                           <!--TODO: Create the dynamic router for the yep button,  based on the date created by the users -->
                            <router-link to="/datecount" class="button">Yep!</router-link>
                        </div>
                    </form>
                    <router-view></router-view>
                </div>
                <div class="column ">
                    <ul>
                        <li v-for="data in datalist" :key="data" @click="handleChangePage(data)" >{{data}}</li>
                       
                    </ul>

                </div>
            </div>
        </div>
    </body>
</template>

<script>
export default {
    data(){
        return {
            datalist:["Emily's Birthday 10-26","Daniel's Birthday 01-14","New Year Birthday 01-01"]

        }
    },
    methods:{
        handleChangePage(id){
            // this.$router.push(`/datecount`)
            // this.$router.push(`/datelist/${id}/datecount`)
            this.$router.push({name:"datecount", params:{dateid:id}})
        }
    }
    
}
</script>

<style scoped>
body{
    background:black;
    display: grid;
    width:100%;
    background-size:100%;
    /* justify-content:center; */
    place-items: center;
    z-index: 1;
    position: relative;
}
p{
    font-size: 20px;
    color: white;
}
.title{
    color:white;
}
.row1, .row2{
    margin: 5px;
    margin-bottom: 15px;
}
 form{
    margin-top: 15px;

 }

.column{
    width: 50%;
    float:left;
}

ul{
    margin-top:10px;
    height:200px;
    overflow: auto;
}
.wrapper{
    width:700px;
    margin: 0 auto;
    border:1px tan;
}

input{
    margin:10px;
    margin-left: 0;
    margin-top:25px;
 
}

ul{
    list-style-type: circle;
           color:rgb(92, 206, 206);
           list-style-position: inside;
           font-size:20px;
           line-height: 30px;
           margin: px 0; 
           list-style-type:none;
    /* list-style-image: square inside url('../assets/diamond.png'); */
}

/* 
.myactive{
    color:red;
} */




.button {
    margin: 0 10%;
    margin-top: 5%;
    white-space:nowrap;
    color:  white;
    display: block;
    width:15%;
    line-height: 170%;
    font-size:90%;
    text-align: center;
    position: relative;
    background:rgb(22, 22, 22);;
    place-items: center;
    border-radius: 50px;
    left: 0; 
    right: 0; 
    margin-left: 5%; 
    margin-right: 5% ; 
    

    float:left;
}

.button::before{
    position: absolute;
    content:"";
    border-radius: 50px;
    width:103%;
    height:106%;
    background-color:transparent;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    z-index: -1;
}
.button::after{
    position: absolute;
    content:"";
    border-radius: 50px;
    width:103%;
    height:106%;
    background-color:transparent;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    z-index: -2;
}

.button:hover:before{
    background: linear-gradient(150deg,rgb(236, 27, 62), gold) ;
}
.button:hover:after{
    background: pink; 
    filter: blur(5px);
}
</style>