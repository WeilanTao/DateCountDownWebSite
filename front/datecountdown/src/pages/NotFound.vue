<template>
<body>
    <div class="wrapper">
        <div class="item1">
            Oops...
        </div>
        <div class="item2">
            404 Not Found

            <span class="gradient"></span>
        </div> 
    
        
    </div>
</body>
    
</template>


<script>
export default {
    
}
</script>

<style scoped>

@font-face {
    font-family: 'neonscript';
    src: url('../assets/NEONCITYSCRIPTDemo.ttf');
}
@font-face {

    font-family: 'BigShouldersStencilText';
    src: url('../assets/Big_Shoulders_Stencil_Text/BigShouldersStencilText-ExtraBold.ttf');
}

body{
    background:black;
    width:100%;
    background-size:100%;
    position: absolute;
    display: grid;
    justify-content:center;
    place-items: center;
}

.wrapper{
    display: grid;
    /* grid-template-columns: auto auto auto auto; */
    grid-gap: 10px;

    grid-row-gap:5px;
    /* padding: 10px; */
    color:white;
}


.item1{
    font-family: 'neonscript';
    text-align: left;
    font-size:60px;
    line-height: 60px;
    background: black;
    color:  #f5b1b4;
    text-shadow: 0 0 3px #f57ec3, 0 0 5px  #f57ec3, 0 0 10px#f57ec3, 0 0 15px #f57ec3, 0 0 20px #f57ec3,0 0 21px #e60073;
    filter: brightness(100%);

}


.item2{
    font-family: 'BigShouldersStencilText';
    text-align: right;
    font-size:40px;
    color: #ffffff;
    background:#000000;
    filter: brightness(300%);
    /* animation: flicker 3s linear infinite */
}
.item2::after{
    font-size:43px;
    content: ' 404';
    position: absolute;
    background: black ;  
    color:black ;
    transform: translate(-345%, 0%);
    animation: twickle 2s linear infinite;
}

@keyframes twickle {
    0%, 5%, 22%,  95%{
        opacity:3%
    }
   
    6%, 21%, 23%{
        opacity:70%
    } 
}


.item2::before {
    content: '404 Not Found';
    position: absolute;
    mix-blend-mode: difference;
    filter:blur(1px);   
}
.gradient{
    background: linear-gradient(100deg, rgb(6, 250, 156) ,rgb(64, 67, 229) );
    position: absolute;
    top: 0;
    left:0;
    width: 100%;
    height:100%;
    mix-blend-mode: multiply;    
}




</style>
