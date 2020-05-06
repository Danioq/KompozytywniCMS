import styled from 'styled-components';

export let LoginForm = styled.form`
    align-self: center;
    text-align: center;
    display: flex;
    flex-direction: column;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    border: 3px solid #7FFE02;
    border-radius: 20px;
    width: 30vw;
    padding: 10px;
    background-color: rgb(236, 240, 233);
`;

export let Tittle = styled.p.attrs({
    
})`
    /* padding-bottom: 20px; */
    color: #7FFE02;
    font-weight: bold;
    font-size: 5vh;
    `;
export let LabelLogin = styled.label.attrs({
    value: 'Login'
})`

`;

export let LoginInput = styled.input.attrs({
})`
    display: 'inline-block';
    align-self: center;
    border: 2px solid #7FFE02;
    border-radius: 10px;
    height: 4vh;
    margin: 5px;
    width: 45%;
    outline: none;
    padding-right: 10px;
    padding-left: 10px;
`;

export let LabelPassword = styled.label.attrs()``;

export let PasswordInput = styled.input.attrs({
    type: 'password',
})`
    align-self: center;
    border: 2px solid #7FFE02;
    border-radius: 10px;
    height: 4vh;
    margin: 5px;
    display: 'inline-block';
    width: 45%;
    outline: none;
    padding-right: 10px;
    padding-left: 10px;
`;

export let LoginButton = styled.input.attrs({
    type: 'submit',
    value: 'Login'
})`
    display: 'inline-block';
    align-self: center;
    border: 2px solid #7FFE02;
    border-radius: 15px;
    height: 4vh;
    background-color: #7FFE02;
    margin: 20px;
    width: 30%;
`;