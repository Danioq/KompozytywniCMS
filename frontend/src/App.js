import React from 'react';
import './App.css';
import Navbar from './components/Navbar'
import styled from 'styled-components';
import About from './components/About'
import {Switch, BrowserRouter as Router, Route} from 'react-router-dom';
import News from './components/News';
import Projects from './components/Projects';
import Galery from './components/Galery';

const MainContainer = styled.div`
  width: 80vw;
  background-color: white;
  justify-self: center;
  margin: auto;
  height: 100vh;
`;


function App() {
  return (
      <Router>
        <MainContainer>
          <Navbar/>

          <Switch>
            <Route path="/">
              <About />
            </Route>
            <Route path="/about">
              <About />
            </Route>
            <Route path="/news">
              <News />
            </Route>
            <Route path="/projects">
              <Projects />
            </Route>
            <Route path="/galery">
              <Galery />
            </Route>
          </Switch>
        </MainContainer>
      </Router>
  );
}

export default App;
