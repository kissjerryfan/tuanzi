<template>
  <div class="app-container">
    <div class="box box-element">
      <div class="view">
        <div class="carousel slide" id="myCarousel">
          <ol class="carousel-indicators">
            <li class="active" data-slide-to="0" data-target="#myCarousel"></li>
            <li data-slide-to="1" data-target="#myCarousel" class=""></li>
            <li data-slide-to="2" data-target="#myCarousel" class=""></li>
          </ol>
          <div class="carousel-inner">
<!--            <div class="item active">-->
<!--              <img alt="" src="@/assets/images/default.jpg">-->
<!--              <div class="carousel-caption">-->
<!--                <h4>First Thumbnail label</h4>-->
<!--                <p>-->
<!--                  Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.-->
<!--                </p>-->
<!--              </div>-->
<!--            </div>-->
<!--            <div class="item">-->
<!--              <img alt="" src="@/assets/images/default1.jpg">-->
<!--              <div class="carousel-caption">-->
<!--                <h4>Second Thumbnail label</h4>-->
<!--                <p>-->
<!--                  Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.-->
<!--                </p>-->
<!--              </div>-->
<!--            </div>-->
            <div class="item">
              <img alt="" src="@/assets/images/default2.jpg">
              <div class="carousel-caption">
<!--                <h4>Third Thumbnail label</h4>-->
                <p>
                  Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                </p>
              </div>
            </div>
          </div>

          <a class="left carousel-control" href="#myCarousel" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left"></span>
          </a>
          <a class="right carousel-control" href="#myCarousel" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right"></span>
          </a>
        </div>

      </div>
    </div>

    <br>
    <h3>随心练文章推送</h3>
    <hr>

    <el-row :gutter="15">
      <el-form ref="elForm" :model="formData" :rules="rules" size="medium" label-width="100px">
        <el-col :span="12">
          <el-form-item label="单行文本" prop="articleTit">
            <el-input v-model="formData.articleTit" placeholder="请输入单行文本" clearable
              prefix-icon='el-icon-collection-tag' :style="{width: '100%'}"></el-input>
          </el-form-item>
        </el-col>
        <el-col :span="12">
            <el-button type="primary" icon="el-icon-search" size="medium"> 上传 </el-button>
        </el-col>
        <el-col :span="24">
          <el-form-item label="多行文本" prop="articleCont">
            <el-input v-model="formData.articleCont" type="textarea" placeholder="请输入多行文本"
              :autosize="{minRows: 4, maxRows: 4}" :style="{width: '100%'}"></el-input>
          </el-form-item>
        </el-col>
        <el-col :span="24">
          <el-row gutter="15">
          </el-row>
        </el-col>
        <el-col :span="24">
          <el-row gutter="15">
          </el-row>
        </el-col>
        <el-col :span="24">
          <el-row gutter="15">
          </el-row>
        </el-col>
        <el-col :span="24">
          <el-row gutter="15">
          </el-row>
        </el-col>
        <el-col :span="24">
          <el-form-item size="large">
            <el-button type="primary" @click="submitForm">提交</el-button>
            <el-button @click="resetForm">重置</el-button>
          </el-form-item>
        </el-col>
      </el-form>
    </el-row>
    <hr>
    <h3 id="newArticle">已推送文章</h3>
    <hr>
    <div class="panel panel-default">
      <h3 class="panel-heading">
        Chinatown
      </h3>
      <div class="panel-body">
        　　On the surface, Chinatown is prosperous - a &quot;model slum,&quot; some have called it - with the lowest crime rate, highest employment and least juvenile delinquency of any city district. Walk through its crowded streets at any time of day, and every shop is doing a brisk and businesslike trade: restaurant after restaurant is booming; there are storefront displays of shiny squids, clawing crabs and clambering lobster; and street markets offer overflowing piles of exotic green vegetables, garlic and ginger root. Chinatown has the feel of a land of plenty, and the reason why lies with the Chinese themselves: even here, in the very core of downtown Manhattan, they have been careful to preserve their own way of dealing with things, preferring to keep affairs close to the bond of the family and allowing few intrusions into a still-insular culture. There have been several concessions to Westerners - storefront signs now offer English translations, and Haagen Dazs and Baskin Robbins ice-cream stores have opened on lower Mott Street - but they can&#39;t help but seem</p><p>　　incongruous. The one time of the year when Chinatown bursts open is during the Chinese New Year festival, held each year on the first full moon after</p><p>　　January 19, when a giant dragon runs down Mott Street to the accompaniment of firecrackers, and the gutters run with ceremonial dyes.</p><p>　　Beneath the neighborhood&#39;s blithely prosperous facade, however, there is a darker underbelly. Sharp practices continue to flourish, with traditional</p>
      </div>
    </div>
    <hr>
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">
          Adult ceremony
        </h3>
      </div>
      <div class="panel-body">
        　　Adult ceremony maybe is not very familiar for our Chinese. Although in the old time, our country also has the tradition to have adult ceremony, now most areas have given it up. It is a ceremony to celebrate the children become adults. In German, adult ceremony is a traditional festival with a long history. Everyone reaching the age of fourteen is adult in their religious belief and custom. Every April or May, they will dress well to take part in the adult ceremony with the companion of their parents or friends. At first, there will be a speech spoken by some respectable people. They will remind the kids of their new rights and duties. And then people will congratulate them become adults. Later the adults will hold dancing party for them. This is the German adult ceremony. Except German, there are still some places having adult ceremony, which will be similar.
      </div>
    </div>
  </div>
</template>

<script>
export default {
  components: {},
  props: [],
  data() {
    return {
      formData: {
        articleTit: undefined,
        uploadBtn: undefined,
        articleCont: undefined,
      },
      rules: {
        articleTit: [{
          required: true,
          message: '请输入单行文本',
          trigger: 'blur'
        }],
        articleCont: [{
          required: true,
          message: '请输入多行文本',
          trigger: 'blur'
        }],
      },
    }
  },
  computed: {},
  watch: {},
  created() {},
  mounted() {},
  methods: {
    submitForm() {
      this.$refs['elForm'].validate(valid => {
        if (!valid) return
        // TODO 提交表单
      })
    },
    resetForm() {
      this.$refs['elForm'].resetFields()
    },
  }
}

</script>
<style>
</style>
