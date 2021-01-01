<template>
<body>
        <a href="#" class="h1">DATES COUNT DOWN</a>
        <table>
            <tr>
                <td class="label">
                    <label for="email">Account/Email:</label>
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
                      <a href="https://www.youtube.com/"   class="button" target="_blank">Login</a>
                      <a href="#" id="signup"  class="button" >Register</a>

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

body{
    background:black;
    /* background:linear-gradient(rgb(126, 126, 226),rgb(47, 59, 114)); */
    display: grid;
    width:100%;
    background-size:100%;
    justify-content:center;
    position: absolute;
    z-index: 1;
    place-items: center;
}
.h1{
    display: block;
    line-height: 50px;
    font-family: 'neon';
    font-size:50px;
    /* margin-top: 8%; */
    /* margin-bottom: -40%; */
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
    margin-top:-30%;
    position: relative;
}
td.label{
    border:6px;
    width:20%; 
    border:6px solid rgba(0,0,0,0) ;
}
td.input{
    border:6px;
    width:80%;
    border:6px solid rgba(0,0,0,0) ;
}
td.buttons{
    border:6px;
    display:flex;
    /* border:6px solid rgba(0,0,0,1) ; */

}

    .button {
    margin: 0 8%;
    margin-top: 5%;
    white-space:nowrap;
    color:  white;
    display: block;
    width:20%;
    line-height: 170%;
    font-size:90%;
    text-align: center;
    position: relative;
    background:rgb(22, 22, 22);;
    place-items: center;
    border-radius: 50px;
    left: -30px; 
    right: 0; 
    margin-left: auto; 
    margin-right: auto; 

    }

.button::before{
    position: absolute;
    content:"";
    border-radius: 50px;
    width:105%;
    height:108%;
    background-color:transparent;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -49%);
    z-index: -1;
}
.button::after{
    position: absolute;
    content:"";
    border-radius: 50px;
    width:108%;
    height:108%;
    background-color:transparent;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -49%);
    z-index: -2;
}

.button:before{
        background: linear-gradient(170deg, rgb(228, 110, 110), rgb(201, 201, 65), purple) ;

    /* background: linear-gradient(170deg, rgba(47, 90, 168, 1), rgba(102, 101, 94, 0.5), rgba(20, 173, 140, 1)) ; */
    animation: rotate 1.5s linear infinite;
}

@keyframes rotate {
  0%{
    filter: hue-rotate(0deg);
  }
  100%{
    filter: hue-rotate(360deg);
  }
}
.button:after{
    background: rgba(64, 224, 208,0.7); 
    filter: blur(5px);
}

label{
    float:right;
    color:rgb(185, 243, 245);
}

input{
    color:rgb(185, 243, 245);

    display: block;
    width:80%;
    border-radius: 3px;
    border: 1px solid rgb(9, 99, 233);
    padding: 0.15rem;
    background: black;
    /* background-image: none; */
    
}



@media only screen and (max-width: 900px){
.h1{
    font-size:30px;
}

table{
    width: 300px;
    margin-top: -40%;
}
.button{
width:30%;
font-size:70%;
}
}
</style>