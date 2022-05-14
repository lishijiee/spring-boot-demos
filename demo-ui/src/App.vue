<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <SpacexToc msg="Not Spacex"/>
  <HelloWorld msg="Welcome to Demos"/>

</template>

<script>
import SpacexToc from "@/components/SpacexToc";
import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'App',
  components: {
    SpacexToc,
    HelloWorld,
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
