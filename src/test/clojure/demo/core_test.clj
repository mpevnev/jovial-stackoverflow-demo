(ns demo.core-test
  (:require
    [clojure.test :refer [is testing]]
    [demo.core :as d]
    [demo.c2]
    [demo.c3]))

(testing "is ok?"
  (is (= (d/f-123) 123)))
