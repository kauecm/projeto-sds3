import BarCharts from "componets/BarCharts";
import DataTable from "componets/DataTable";
import Footer from "componets/Footer";
import NavBar from "componets/NavBar";
import PieCharts from "componets/PieCharts";

function App() {
  return (
    <>
    <NavBar/>
    <div className="container">
      <h1 className="text-primary py-3">Dashboard de Vendas</h1>
      <div className="row px-3">
        <div className="col-sm-6">
          <h5 className="text-center text-secondary">Taxa de Sucesso (%)</h5>
          <BarCharts/>
        </div>
        <div className="col-sm-6">
          <h5 className="text-center text-secondary">Todas Vendas</h5>
          <PieCharts/>
        </div>
      </div>
      <div className="py-3"> 
      <h2 className="text-primary">Todas as Vendas</h2>
      </div>
      <DataTable/>
    </div>
    
    <Footer/>
    </>
  );
}

export default App;
