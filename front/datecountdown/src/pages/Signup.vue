<template>
    <body >
        <h1>Write Your Personal Details</h1>
        <div class= "wrapper">
            <form >
                <div class="row">

                    <div class="column left" >
                        <input type="text" name="firstname" placeholder="FirstName" >
                        <input type="password" name="password" placeholder="Password" >
                        <input type="password" name="confirmpassword" placeholder="Confirm Password">
                    </div>
                    <div class="column right" >
                        <input type="text" name="lastname" placeholder="LastName" >
                        <input type="email" name="email" placeholder="Email" >
                        <input type="email" name="confirmemail" placeholder="ConfirmEmail" >
                    </div>
                </div>
                <div class="row lower" >
                     <a href="https://www.youtube.com/"  class="button"> Create Account</a>
                </div>
            
            </form>
        </div>
    </body>
</template>

<script>
export default {
    name:'SignUp',
}
</script>

<style scoped>

* {
  box-sizing: border-box;
}


@font-face {
    font-family: 'neonsignin';
    src: url('../assets/neon_glow/NEONGLOW.otf');
}

body{
    background:black;
    width:100%;
    background-size:100%;
    position: absolute;
    display: grid;
    z-index: 1;
    justify-content:center;
    place-items: center;
}

.wrapper{
    width:600px;
    margin:0 auto;
    display: grid;
}

.column{
    float:left;
    width:50%;
    padding: 10px;
}

/* .row{
    height:100px;
} */
.left input{
    float:left;
}

.right input {
    float: right;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

h1{
    display: block;
    line-height: 60px;
    font-family: 'neonsignin';
    font-size:40px;
    /* margin-top: 8%; */
    margin-bottom: -26%;
    text-align: center;
    border:6px solid rgba(0,0,0,0) ;
    white-space:nowrap;

    /* Neon effect */
    color:  white;
    /* text-shadow: 0 0 3px  rgb(207, 226, 250), 0 0 5px  rgb(207, 226, 250), 0 0 10px #f55cb5, 0 0 15px #f55cb5, 0 0 30px #e60073, 0 0 40px #e60073, 4px 4px 4px rgba(15, 169, 241,0.8),-4px -4px 4px rgba(15, 169, 241, 0.8),-2px 2px 2px rgba(226, 241, 15,0.7),2px -2px 2px rgba(226, 241, 15,0.7); */

}



input{
    display: block;
    color:rgb(185, 243, 245);
    border-radius: 3px;
    border: 1px solid rgb(9, 99, 233);
    background: black;
    margin: 5% 5%;
}

.button {
margin: 0 auto;
margin-top: 5%;
white-space:nowrap;
color:  white;
display: block;
width:20%;
line-height: 200%;
font-size:80%;
text-align: center;
/* with out the position: relative; the psedo element will be positioned accouding to this emelemt's parent element */
position: relative;
/* border: 1.5px solid black; */
background:rgb(22, 22, 22);;
place-items: center;
border-radius: 50px;
left: 0; 
  right: 0; 
 margin-left: auto; 
  margin-right: auto; 
  width: 100px; 

}

.button::before{
    position: absolute;
    content:"";
    border-radius: 50px;
    width:103%;
    height:103%;
    background-color:transparent;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -51%);
    z-index: -1;
}
.button::after{
    position: absolute;
    content:"";
    border-radius: 50px;
    width:103%;
    height:103%;
    background-color:transparent;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -51%);
    z-index: -2;
}

.button:hover:before{
    background: linear-gradient(170deg, rgba(47, 90, 168, 1), rgba(102, 101, 94, 0.5), rgba(20, 173, 140, 1)) ;
}
.button:hover:after{
    background: rgba(64, 224, 208,0.7); 
    filter: blur(5px);
}


</style> 