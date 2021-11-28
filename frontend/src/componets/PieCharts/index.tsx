import axios from 'axios';
import { type } from 'os';
import Chart from 'react-apexcharts'
import { SaleSum } from 'types/sale';
import { BASE_URL } from 'utils/request';

type ChartData = {
    labels: string[];
    series: number[]; 
}


function PieCharts() {
    //FORMA ERRADA
    let chartData : ChartData = {labels: [], series:[] };

    axios.get(`${BASE_URL}/sales/sumBySeller`)
        .then(response =>{
            const data = response.data as SaleSum[];
            const myLabels = data.map(x => x.sellerName);
            const mySeries = data.map(x => x.sum);

            chartData = {labels : myLabels, series:mySeries }

            console.log(response.data);

        });

   // const mockData = {
   //     series: [477138, 499928, 444867, 220426, 473088],
   //   labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
   // }
    
    const options = {
        legend: {
            show: true
        }
    }
  
    return (
        <Chart 
        options={{ ...options, labels: chartData.labels}}
        series={chartData.series}
        type="pie"
        height="240"
        />
    );
  }
  
  export default PieCharts;