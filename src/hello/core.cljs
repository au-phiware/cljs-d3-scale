(ns hello.core (:require [d3-interpolate]
                         [d3-scale :refer [scaleLinear]]))

(-> (scaleLinear)
    (.domain #js [0 100])
    (apply [0.5])
    js/document.write)
