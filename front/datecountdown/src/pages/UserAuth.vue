<template>
<body>
        <h1>Date Count Down</h1>

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

*{
    margin:0;
    padding:0;
}

body{
        /* background:black; */

    background:linear-gradient(rgb(126, 126, 226),rgb(47, 59, 114));
    /* justify-content:center; */
    position: relative;
}
h1{
 font-size:80px;
 color:white;
}

table{
    /* height:30% ; */
    /* width:350px; */
    margin:70%,50%,30%,50%;
    position: relative;
    border:1px solid#000;
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
    color:coral;
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

</style>