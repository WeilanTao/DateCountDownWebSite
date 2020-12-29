<template>
<body>
        <h1>DATES COUNT DOWN</h1>

        <table>
            <tr>
                <td class="label">
                    <label for="email">Account/Eail:</label>
                </td>
                <td class="input">
                    <input type="email" id="email" placeholder="Please enter your email...">
                </td>        
            </tr>
            <tr>
                 <td class="label">
                    <label for="password">Password:</label>
                </td>
                <td class="input">
                    <input type="password" id="password" placeholder="Please enter your password...">
                </td> 
            </tr>
            <tr>
                <td >
                </td>
                <td class="buttons">
                      <button>Login</button>
                    <button >Signup</button>
                </td>
            </tr>
        </table>

</body>
</template>

<script>
export default {
    name:'UserAuth',
}
</script>

<style scoped>

@font-face {
    font-family: 'neon';
    src: url('../assets/neon_planet_display/NeonPlanetDisplay.ttf');
}

*{
    margin:0;
    padding:0;
}

body{
        background:black;
    display: table;
    width:100%;
    /* background:linear-gradient(rgb(126, 126, 226),rgb(47, 59, 114)); */
    background-size:100%;
    justify-content:center;
    position: relative;
}
h1{
    display: block;
    line-height: 100px;
    font-family: 'neon';
    font-size:70px;
    margin-top: 10%;
    margin-bottom: -40%;
    text-align: center;
    border:6px solid rgba(0,0,0,0) ;
    white-space:nowrap;
    
    /* Neon effect */
    color:  rgb(225, 236, 250);
    -webkit-animation: neoneffect 10s ease-in-out   infinite alternate;
    -moz-animation: neoneffect 1s ease-in-out  infinite alternate;
    animation: neoneffect 1s ease-in-out  infinite alternate;
}

@-webkit-keyframes neoneffect {
    from {
    text-shadow: 0 0 3px  rgb(207, 226, 250), 0 0 5px  rgb(207, 226, 250), 0 0 10px #f55cb5, 0 0 15px #f55cb5, 0 0 20px #e60073,0 0 21px #e60073;
  }
  
  to {
    text-shadow: 0 0 3px  rgb(207, 226, 250), 0 0 5px  rgb(207, 226, 250), 0 0 10px #f55cb5, 0 0 15px #f55cb5, 0 0 30px #e60073, 0 0 40px #e60073, 4px 4px 4px rgba(15, 169, 241,0.8),-4px -4px 4px rgba(15, 169, 241, 0.8),-2px 2px 2px rgba(226, 241, 15,0.7),2px -2px 2px rgba(226, 241, 15,0.7);
}
}

table{
    height:30% ;
    width:500px;
    margin:50% auto -10% auto;
    position: relative;
    /* border:1px solid#000; */
}
td.label{
    width:20%; 
    border:6px ;
}
td.input{
    width:80%;
    border:6px solid rgba(0,0,0,0) ;
}
td.buttons{
    border:6px solid rgba(0,0,0,0) ;
    display:flex;
    justify-content:space-evenly;
    
}
button{
border-radius: 10px;
border-color:yellow;
}

label, button{
    color:rgb(185, 243, 245);
}

label{
    float:right;
}

input {
    display: block;
    width:90%;
    border-radius: 8px;
    border: 1px solid rgb(9, 99, 233);
    padding: 0.15rem;
    
}

input:focus{
    border-color:yellow;
    background:linen;

}

@media only screen and (max-width: 900px){
h1{
    font-size:40px;
}

table{
    width: 300px;
}

}
</style>