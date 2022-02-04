import './App.css';
import FooterComponent from './components/FooterComponent';
import HeaderComponent from './components/HeaderComponent';
import ListEmployeeComponent from './components/ListEmployeeComponent';

import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import AddEmployeeComponent from './components/AddEmployeeComponent';
import ViewEmployeeComponent from './components/ViewEmployeeComponent';

function App() {
  return (
    <div>
      <Router>
        <HeaderComponent />

        <div class="container">
          <Switch>
            <Route path="/" exact component={ListEmployeeComponent} />
            <Route path="/employees" component={ListEmployeeComponent} />
            <Route path="/add-employee/:id" component={AddEmployeeComponent} />
            <Route path="/view-employee/:id" component={ViewEmployeeComponent} />
          </Switch>
        </div>

        <FooterComponent />
      </Router>






    </div>
  );
}

export default App;


<ListEmployeeComponent />