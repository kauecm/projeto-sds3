import axios from 'axios';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts'
import { SaleSum } from 'types/sale';
import { BASE_URL } from 'utils/request';

type ChartData = {
    labels: string[];
    series: number[]; 
}


function PieCharts() {

    const [chartData, setChartData] = useState<ChartData>({labels : [], series : []});
    

    useEffect(()=>{
        axios.get(`${BASE_URL}/sales/sumBySeller`)
        .then(response =>{
            const data = response.data as SaleSum[];
            const myLabels = data.map(x => x.sellerName);
            const mySeries = data.map(x => x.sum);

            setChartData({labels : myLabels, series : mySeries });
            

        });
    } ,[]);

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