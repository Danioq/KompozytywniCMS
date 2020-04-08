import React from 'react';
import './App.css';
import Navbar from './components/Navbar'
import styled from 'styled-components';

const MainContainer = styled.div`
  width: 80vw;
  background-color: white;
  justify-self: center;
  margin: auto;
  height: 100vh;
`;


function App() {
  return (
      <MainContainer>
        <Navbar/>
      </MainContainer>
  );
}

export default App;
