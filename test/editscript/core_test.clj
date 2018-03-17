(ns editscript.core-test
  (:require [clojure.test :refer :all]
            [editscript.core :refer :all]))

(deftest min+plus->replace-test
  (testing "Replacement of consecutive :- :+ with :r"
    (is (= (min+plus->replace [:- :+ 2 3 4 :- :- :+ 3 4 :- 3 :+ :e])
           [:r 2 3 4 :- :r 3 4 :- 3 :+ :e]))
    (is (= (min+plus->replace [:- :+ 2 3 4 :- :- :+ 3 4 :- :+ :e])
           [:r 2 3 4 :- :r 3 4 :r :e]))
    (is (= (min+plus->replace [:- :+]) [:r]))
    (is (= (min+plus->replace [:- :+ 3]) [:r 3]))))
