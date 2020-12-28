<template>
    <form>
        <div class="form-control">
            <label for="email">Account/E-Mail</label>
            <input type="email" id="email" placeholder="Please enter your email...">
        </div>
        <div class="form-control">
            <label for="password">Password</label>
            <input type="password" id="password" placeholder="Please enter your password...">
        </div>
        <button>Login</button>
        <button mode="flat">Signup</button>
    </form>
</template>


<script>
export default {
    name:'UserAuth',
}
</script>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Spectral:wght@200&display=swap');

form{
    background:linear-gradient(rgb(126, 126, 226),rgb(47, 59, 114))
}

input {
    display: block;
    width:30%;
    font-family: 'Spectral', serif;
    border: 1px solid rgb(9, 99, 233);
    padding: 0.15rem;
}

input:focus{
    border-color:yellow;
    background:linen;

}

</style>