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
                <div class="row">
                     
                     <a href="#" class="button" >Create Account!</a>
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
    display: table;
    width:100%;
    background-size:100%;
    position: relative;
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
    line-height: 100px;
    font-family: 'neonsignin';
    font-size:40px;
    /* margin-top: 8%; */
    /* margin-bottom: -40%; */
    text-align: center;
    border:6px solid rgba(0,0,0,0) ;
    white-space:nowrap;

    /* Neon effect */
    color:  rgb(225, 236, 250);
    text-shadow: 0 0 3px  rgb(207, 226, 250), 0 0 5px  rgb(207, 226, 250), 0 0 10px #f55cb5, 0 0 15px #f55cb5, 0 0 30px #e60073, 0 0 40px #e60073, 4px 4px 4px rgba(15, 169, 241,0.8),-4px -4px 4px rgba(15, 169, 241, 0.8),-2px 2px 2px rgba(226, 241, 15,0.7),2px -2px 2px rgba(226, 241, 15,0.7);

}

input{
    display: block;
    color:rgb(185, 243, 245);
    border-radius: 3px;
    border: 1px solid rgb(9, 99, 233);
    background: black;
    margin: 10% 5%;
}

.button{
margin: 0 auto;
margin-top: 5%;
white-space:nowrap;
color:  rgb(225, 236, 250);
display: block;
width:30%;
line-height: 200%;
font-size:80%;
text-align: center;
border: 1.5px solid;
border-image: linear-gradient(170deg, rgba(47, 90, 168, 1), rgba(102, 101, 94, 0.5), rgba(20, 173, 140, 1)) 1 ; 
}



</style>