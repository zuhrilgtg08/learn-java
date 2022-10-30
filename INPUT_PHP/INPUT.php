<?php
<!DOCTYPE html>
<html>
<head>
    <title>Registrasi</title>

    <style>

    	:root{
    		--pink: #ff3399;
    		--violet: #6c5ce7;
    		--gradient: linear-gradient(90deg, var(--violet), var(--pink));
    	}
    	*{
    		box-sizing: border-box;
    		padding: 0;
    		margin: 0;
    		text-decoration: none;
    		outline: none;
    		text-transform: capitalize;
    		transition: all .3s linear;
    	}

    	html{
    		font-size: 62.5%;
    	}

    	form{
    		border: .1rem solid rgba(0, 0, 0, .1);
    		border-radius: .5rem;
    		padding: 2rem;
    	}

    	form .inputBox{
    		display: flex;
    		justify-content: space-between;
    		flex-wrap: wrap;
    	}

    	form .inputBox input{
    		width: 100%;
    		padding: 1rem;
    		margin: .7rem 0;
    		font-size: 1.7rem;
    		border: .1rem solid rgba(0, 0, 0, .1);
    		border-radius: .5rem;
    		text-transform: none;
    		color: #333;
    		border-color: var(--pink);
    	}

    	form .inputBox label{
    		font-size: 2rem;
    	}

    	form .btn{
    		display: inline-block;
    		margin-top: 1rem;
    		padding: .8rem 3rem;
    		border-radius: .5rem;
    		background: #333;
    		color: #fff;
    		cursor: pointer;
    		font-size: 1.7rem;
    	}

    	form .btn:hover{
    		background-color: var(--gradient);
    	}
    </style>
</head>
<body>
    <form action="">
        <div class="inputBox">
        	<label>Nama Siswa</label>
            <input type="text" placeholder="Nama Siswa">

            <label>NISN Siswa</label>
            <input type="number" placeholder="NISN Siswa">
        </div>
        <input type="submit" class="btn" value="Daftar">
    </form>
</body>
</html>
?>