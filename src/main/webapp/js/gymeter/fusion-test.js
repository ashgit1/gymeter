FusionCharts.ready(function () {
    var chartWidth = '550',
        chartHeight = '300',
        dataType = 'json';
    
    // WeightLine Line Chart
    var dailyWeightLineChart = new FusionCharts({
        type: 'line',
        renderAt: 'weight-container-line',
        width: chartWidth,
        height: chartHeight,
        dataFormat: dataType,
        dataSource: {
            "chart":{
                "caption":"Weekly Weight Check Trend for the last quater",
                "subcaption":"From 80 to 86",
                "xaxisname":"Date",
                "yaxisname":"Weights in Kgs",
                "setAdaptiveYMin": "1",
                "exportEnabled": "1",
                "showBorder": "1",
                "borderColor": "#666666",
                "borderThickness": "4",
                "borderAlpha": "80",
                "canvasBgAlpha": "0",
                "bgColor": "EEEEEE,CCCCCC",
                "bgratio": "60,40",
                "bgAlpha": "70,80",
                "theme":"fint"
            },		
            "data":[
                {
                    "label":"1 Jan",
                    "value":"85.4"
                },		
                {
                    "label":"8 Jan",
                    "value":"85"
                },		
                {
                    "label":"15 Jan",
                    "value":"84.9"
                },		
                {
                    "label":"22 Jan",
                    "value":"84.6"
                },		
                {
                    "label":"29 Jan",
                    "value":"84.3"
                },		
                {
                    "label":"5 Feb",
                    "value":"83.3"
                },		
                {
                    "label":"12 Feb",
                    "value":"84.2"
                },		
                {
                    "label":"19 Feb",
                    "value":"84.1"
                },		
                {
                    "label":"26 Feb",
                    "value":"83.1"
                },		
                {
                    "label":"1 March",
                    "value":"83.4"
                },		
                {
                    "label":"8 March",
                    "value":"83"
                },		
                {
                    "label":"15 March",
                    "value":"82.9"
                },		
                {
                    "label":"22 March",
                    "value":"82.6"
                },		
                {
                    "label":"29 March",
                    "value":"81.7"
                },		
                {
                    "label":"5 April",
                    "value":"81.5"
                },		
                {
                    "label":"12 APril",
                    "value":"81.5"
                },		
                {
                    "label":"19 April",
                    "value":"81.3"
                },		
                {
                    "label":"26 April",
                    "value":"81.4"
                },		
                {
                    "label":"3 May",
                    "value":"81"
                },		
                {
                    "label":"10 May",
                    "value":"80.9"
                },		
                {
                    "label":"17 May",
                    "value":"80.5"
                }
            ]
        }
}).render();
    
    // WeightLine Bar Chart
    var dailyWeightBarChart = new FusionCharts({
        type: 'column2d',
        renderAt: 'weight-container-bar',
        width: chartWidth,
        height: chartHeight,
        dataFormat: dataType,
        dataSource: {
            "chart":{
                "caption":"Weekly Weight Check Trend for the last quater",
                "subcaption":"From 80 to 86",
                "xaxisname":"Date",
                "yaxisname":"Weights in Kgs",
                "setAdaptiveYMin": "1",
                "exportEnabled": "1",
                "showBorder": "1",
                "borderColor": "#666666",
                "borderThickness": "4",
                "borderAlpha": "80",
                "canvasBgAlpha": "0",
                "bgColor": "EEEEEE,CCCCCC",
                "bgratio": "60,40",
                "bgAlpha": "70,80",
                "theme":"fint"
            },		
            "data":[
                {
                    "label":"1 Jan",
                    "value":"85.4"
                },		
                {
                    "label":"8 Jan",
                    "value":"85"
                },		
                {
                    "label":"15 Jan",
                    "value":"84.9"
                },		
                {
                    "label":"22 Jan",
                    "value":"84.6"
                },		
                {
                    "label":"29 Jan",
                    "value":"84.3"
                },		
                {
                    "label":"5 Feb",
                    "value":"83.3"
                },		
                {
                    "label":"12 Feb",
                    "value":"84.2"
                },		
                {
                    "label":"19 Feb",
                    "value":"84.1"
                },		
                {
                    "label":"26 Feb",
                    "value":"83.1"
                },		
                {
                    "label":"1 March",
                    "value":"83.4"
                },		
                {
                    "label":"8 March",
                    "value":"83"
                },		
                {
                    "label":"15 March",
                    "value":"82.9"
                },		
                {
                    "label":"22 March",
                    "value":"82.6"
                },		
                {
                    "label":"29 March",
                    "value":"81.7"
                },		
                {
                    "label":"5 April",
                    "value":"81.5"
                },		
                {
                    "label":"12 APril",
                    "value":"81.5"
                },		
                {
                    "label":"19 April",
                    "value":"81.3"
                },		
                {
                    "label":"26 April",
                    "value":"81.4"
                },		
                {
                    "label":"3 May",
                    "value":"81"
                },		
                {
                    "label":"10 May",
                    "value":"80.9"
                },		
                {
                    "label":"17 May",
                    "value":"80.5"
                }
            ]
        }
}).render();
    
    //  No of Days Bar Chart
    var daysInGymBarChart = new FusionCharts({
        type: 'column2d',
        renderAt: 'days-container-bar',
        width: chartWidth,
        height: chartHeight,
        dataFormat: dataType,
        dataSource: {
          "chart": {
        	  "caption": "Numbers of Days in Gym",
              "subCaption": "Per Month",
              "xAxisName": "Month",
              "yAxisName": "# of Days",
              "setAdaptiveYMin": "1",
              "exportEnabled": "1",
              "showBorder": "1",
              "borderColor": "#666666",
              "borderThickness": "4",
              "borderAlpha": "80",
              "canvasBgAlpha": "0",
              "bgColor": "EEEEEE,CCCCCC",
              "bgratio": "60,40",
              "bgAlpha": "70,80",
              "theme": "fint"
           },
           "data": [
                    {
                       "label": "Jan",
                       "value": "20"
                    },
                    {
                       "label": "Feb",
                       "value": "18"
                    },
                    {
                       "label": "Mar",
                       "value": "17"
                    },
                    {
                       "label": "Apr",
                       "value": "23"
                    },
                    {
                       "label": "May",
                       "value": "21"
                    },
                    {
                       "label": "Jun",
                       "value": "17"
                    },
                    {
                       "label": "Jul",
                       "value": "20"
                    },
                    {
                       "label": "Aug",
                       "value": "21"
                    },
                    {
                       "label": "Sep",
                       "value": "19"
                    },
                    {
                       "label": "Oct",
                       "value": "22"
                    },
                    {
                       "label": "Nov",
                       "value": "25"
                    },
                    {
                       "label": "Dec",
                       "value": "19"
                    }
                 ]
        }
    }).render();
    
    //  No of Days Line Chart
    var daysInGymLineChart = new FusionCharts({
        type: 'line',
        renderAt: 'days-container-line',
        width: chartWidth,
        height: chartHeight,
        dataFormat: dataType,
        dataSource: {
          "chart": {
        	  "caption": "Numbers of Days in Gym",
              "subCaption": "Per Month",
              "xAxisName": "Month",
              "yAxisName": "# of Days",
              "setAdaptiveYMin": "1",
              "yAxisMaxValue": "31",
              "exportEnabled": "1",
              "showBorder": "1",
              "borderColor": "#666666",
              "borderThickness": "4",
              "borderAlpha": "80",
              "canvasBgAlpha": "0",
              "bgColor": "EEEEEE,CCCCCC",
              "bgratio": "60,40",
              "bgAlpha": "70,80",
              "theme": "fint"
           },
           "data": [
                    {
                       "label": "Jan",
                       "value": "20"
                    },
                    {
                       "label": "Feb",
                       "value": "16"
                    },
                    {
                       "label": "Mar",
                       "value": "17"
                    },
                    {
                       "label": "Apr",
                       "value": "16"
                    },
                    {
                       "label": "May",
                       "value": "21"
                    },
                    {
                       "label": "Jun",
                       "value": "17"
                    },
                    {
                       "label": "Jul",
                       "value": "20"
                    },
                    {
                       "label": "Aug",
                       "value": "21"
                    },
                    {
                       "label": "Sep",
                       "value": "19"
                    },
                    {
                       "label": "Oct",
                       "value": "22"
                    },
                    {
                       "label": "Nov",
                       "value": "25"
                    },
                    {
                       "label": "Dec",
                       "value": "19"
                    }
                 ]
        }
    }).render();
    
})