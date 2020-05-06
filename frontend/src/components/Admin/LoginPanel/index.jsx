import React from 'react';
import {LoginForm,
        Tittle,
        LabelLogin,
        LabelPassword,
        LoginInput,
        PasswordInput,
        LoginButton} from './styledElements';

export default function LoginPanel(props) {
    return <LoginForm>
        <Tittle>Panel Logowania</Tittle>
        <LabelLogin>Login</LabelLogin>
        <LoginInput />
        <LabelPassword>Hasło</LabelPassword>
        <PasswordInput />
        <LoginButton onClick={props.login} />
    </LoginForm>;
}