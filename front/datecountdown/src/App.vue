<template>
  <div>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: 'App',
//  data(){
//    return null;
//  },
 methods:{

 },
 mounted(){

 }
}
</script>

<style >
*{
  padding:0;
  margin:0;
  text-decoration: none;
}

@font-face {
  font-family:'AbrilFatface' ;
  src: url('./assets/Abril_Fatface/AbrilFatface-Regular.ttf');
}

html,input,button{
      font-family: 'AbrilFatface';
}

body{
  margin:0;
  height:100vh;
}
</style>