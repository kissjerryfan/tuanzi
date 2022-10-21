<template>
  <el-row :gutter="20">
    <el-col :span="12"><div style="height: 400px;width: 600px" id="chart1"></div></el-col>
    <el-col :span="12"><div style="height: 400px;width: 600px" id="chart2"></div></el-col>
    <el-col :span="12"><div style="height: 400px;width: 600px" id="chart3"></div></el-col>
    <el-col :span="12"><div style="height: 400px;width: 600px" id="chart4"></div></el-col>
  </el-row>
</template>

<script>

import echarts from 'echarts'
export default {
  name: 'MyComponent1',
  methods: {
    handleForward (key, keyPath) {
      this.$router.push('/system/role')
    },
    initChart () {
      // 基于准备好的dom，初始化echarts实例
      var myChart = echarts.init(document.getElementById('chart1'))

      var option = {
        title: {
          text: '积分分布'
        },
        legend: {},
        tooltip: {},
        dataset: {
          source: [
            ['product', '小于30', '30-60', '大于60'],
            ['第七周', 43, 5, 2],
            ['第八周', 35, 10, 5],
            ['第九周', 22, 18, 10],
            ['第十周', 10, 18, 22]
          ]
        },
        xAxis: {type: 'category'},
        yAxis: {},
        // Declare several bar series, each will be mapped
        // to a column of dataset.source by default.
        series: [
          {type: 'bar'},
          {type: 'bar'},
          {type: 'bar'}
        ]
      }

      // 使用刚指定的配置项和数据显示图表。
      myChart.setOption(option)
    },
    initChart2 () {
      // 基于准备好的dom，初始化echarts实例
      var myChart2 = echarts.init(document.getElementById('chart2'))

      var option = {
        title: {
          text: '功能使用'
        },
        legend: {},
        tooltip: {},
        dataset: {
          source: [
            //['product', '2015', '2016', '2017'],
            ['趣味学习', 20],//, 85.8, 93.7
            ['课程作业', 10],//, 73.4, 55.1
            ['口语练习',40],
            ['实用工具', 30]
          ]
        },
        // xAxis: {type: 'category'},
        // yAxis: {},
        // Declare several bar series, each will be mapped
        // to a column of dataset.source by default.
        series: [
          // {type: 'bar'},
          // {type: 'bar'},
          // {type: 'bar'}
          {
            type:"pie",
            label : {
              normal : {
                formatter: '{b}: ({d}%)',
                textStyle : {
                  fontWeight : 'normal',
                  fontSize : 15
                }
              }
            },
          }
        ]
      }

      // 使用刚指定的配置项和数据显示图表。
      myChart2.setOption(option)
    },
    initChart3 () {
      // 基于准备好的dom，初始化echarts实例
      var myChart3 = echarts.init(document.getElementById('chart3'))

      var option = {
        title: {
          text: '打卡人数'
        },
        legend: {},
        tooltip: {},
        xAxis: {type: 'category',
          data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']},
        yAxis: {},
        // Declare several bar series, each will be mapped
        // to a column of dataset.source by default.
        series: [
          {
            data: [15, 23, 22, 41, 13, 14, 26],
            type: 'line'
          }
        ]
      }

      // 使用刚指定的配置项和数据显示图表。
      myChart3.setOption(option)
    },
    initChart4 () {
      var chartDom = document.getElementById('chart4');
      var myChart = echarts.init(chartDom);
      var option;

// prettier-ignore
      const hours = [
        '12a', '1a', '2a', '3a', '4a', '5a', '6a',
        '7a', '8a', '9a', '10a', '11a',
        '12p', '1p', '2p', '3p', '4p', '5p',
        '6p', '7p', '8p', '9p', '10p', '11p'
      ];
// prettier-ignore
      const days = [
        'Saturday', 'Friday', 'Thursday',
        'Wednesday', 'Tuesday', 'Monday', 'Sunday'
      ];
// prettier-ignore
      const data = [[0, 0, 5], [0, 1, 1], [0, 2, 0], [0, 3, 0], [0, 4, 0], [0, 5, 0], [0, 6, 0], [0, 7, 0], [0, 8, 0], [0, 9, 0], [0, 10, 0], [0, 11, 2], [0, 12, 4], [0, 13, 1], [0, 14, 1], [0, 15, 3], [0, 16, 4], [0, 17, 6], [0, 18, 4], [0, 19, 4], [0, 20, 3], [0, 21, 3], [0, 22, 2], [0, 23, 5], [1, 0, 7], [1, 1, 0], [1, 2, 0], [1, 3, 0], [1, 4, 0], [1, 5, 0], [1, 6, 0], [1, 7, 0], [1, 8, 0], [1, 9, 0], [1, 10, 5], [1, 11, 2], [1, 12, 2], [1, 13, 6], [1, 14, 9], [1, 15, 11], [1, 16, 6], [1, 17, 7], [1, 18, 8], [1, 19, 12], [1, 20, 5], [1, 21, 5], [1, 22, 7], [1, 23, 2], [2, 0, 1], [2, 1, 1], [2, 2, 0], [2, 3, 0], [2, 4, 0], [2, 5, 0], [2, 6, 0], [2, 7, 0], [2, 8, 0], [2, 9, 0], [2, 10, 3], [2, 11, 2], [2, 12, 1], [2, 13, 9], [2, 14, 8], [2, 15, 10], [2, 16, 6], [2, 17, 5], [2, 18, 5], [2, 19, 5], [2, 20, 7], [2, 21, 4], [2, 22, 2], [2, 23, 4], [3, 0, 7], [3, 1, 3], [3, 2, 0], [3, 3, 0], [3, 4, 0], [3, 5, 0], [3, 6, 0], [3, 7, 0], [3, 8, 1], [3, 9, 0], [3, 10, 5], [3, 11, 4], [3, 12, 7], [3, 13, 14], [3, 14, 13], [3, 15, 12], [3, 16, 9], [3, 17, 5], [3, 18, 5], [3, 19, 10], [3, 20, 6], [3, 21, 4], [3, 22, 4], [3, 23, 1], [4, 0, 1], [4, 1, 3], [4, 2, 0], [4, 3, 0], [4, 4, 0], [4, 5, 1], [4, 6, 0], [4, 7, 0], [4, 8, 0], [4, 9, 2], [4, 10, 4], [4, 11, 4], [4, 12, 2], [4, 13, 4], [4, 14, 4], [4, 15, 14], [4, 16, 12], [4, 17, 1], [4, 18, 8], [4, 19, 5], [4, 20, 3], [4, 21, 7], [4, 22, 3], [4, 23, 0], [5, 0, 2], [5, 1, 1], [5, 2, 0], [5, 3, 3], [5, 4, 0], [5, 5, 0], [5, 6, 0], [5, 7, 0], [5, 8, 2], [5, 9, 0], [5, 10, 4], [5, 11, 1], [5, 12, 5], [5, 13, 10], [5, 14, 5], [5, 15, 7], [5, 16, 11], [5, 17, 6], [5, 18, 0], [5, 19, 5], [5, 20, 3], [5, 21, 4], [5, 22, 2], [5, 23, 0], [6, 0, 1], [6, 1, 0], [6, 2, 0], [6, 3, 0], [6, 4, 0], [6, 5, 0], [6, 6, 0], [6, 7, 0], [6, 8, 0], [6, 9, 0], [6, 10, 1], [6, 11, 0], [6, 12, 2], [6, 13, 1], [6, 14, 3], [6, 15, 4], [6, 16, 0], [6, 17, 0], [6, 18, 0], [6, 19, 0], [6, 20, 1], [6, 21, 2], [6, 22, 2], [6, 23, 6]]
        .map(function (item) {
          return [item[1], item[0], item[2] || '-'];
        });
      option = {
        title: {
          text: '各时段使用人数'
        },
        tooltip: {
          position: 'top'
        },
        grid: {
          height: '50%',
          top: '10%'
        },
        xAxis: {
          type: 'category',
          data: hours,
          splitArea: {
            show: true
          }
        },
        yAxis: {
          type: 'category',
          data: days,
          splitArea: {
            show: true
          }
        },
        visualMap: {
          min: 0,
          max: 10,
          calculable: true,
          orient: 'horizontal',
          left: 'center',
          bottom: '15%'
        },
        series: [
          {
            name: 'Punch Card',
            type: 'heatmap',
            data: data,
            label: {
              show: true
            },
            emphasis: {
              itemStyle: {
                shadowBlur: 10,
                shadowColor: 'rgba(0, 0, 0, 0.5)'
              }
            }
          }
        ]
      };

      option && myChart.setOption(option);
    }
  },

  mounted () {
    this.initChart()
    this.initChart2()
    this.initChart3()
    this.initChart4()
  }
};
// export default {
//   name: "Index",
//   data() {
//     return {
//       // 版本号
//       version: "3.5.0",
//     };
//   },
//   methods: {
//     goTarget(href) {
//       window.open(href, "_blank");
//     },
//   },
// };
</script>

<style scoped lang="scss">
.home {
  blockquote {
    padding: 10px 20px;
    margin: 0 0 20px;
    font-size: 17.5px;
    border-left: 5px solid #eee;
  }
  hr {
    margin-top: 20px;
    margin-bottom: 20px;
    border: 0;
    border-top: 1px solid #eee;
  }
  .col-item {
    margin-bottom: 20px;
  }

  ul {
    padding: 0;
    margin: 0;
  }

  font-family: "open sans", "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-size: 13px;
  color: #676a6c;
  overflow-x: hidden;

  ul {
    list-style-type: none;
  }

  h4 {
    margin-top: 0px;
  }

  h2 {
    margin-top: 10px;
    font-size: 26px;
    font-weight: 100;
  }

  p {
    margin-top: 10px;

    b {
      font-weight: 700;
    }
  }

  .update-log {
    ol {
      display: block;
      list-style-type: decimal;
      margin-block-start: 1em;
      margin-block-end: 1em;
      margin-inline-start: 0;
      margin-inline-end: 0;
      padding-inline-start: 40px;
    }
  }
}
</style>
