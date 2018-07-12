(require 'cljs.build.api)

(cljs.build.api/build
  "src"
  {:main 'hello.core
   :output-to "target/main.js"
   :output-dir "target/main.out"
   :asset-path "main.out"
   :install-deps true
   :verbose true
   ;:debug true
   :optimizations :simple
   :npm-deps {:d3-interpolate "latest"
              :d3-scale "latest"}})
