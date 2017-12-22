(ns pik-logistic-charts.views
  (:require [re-frame.core :as rf]
            [reagent.core :as r]))


(defonce ui-state (r/atom {:geo-zones-collapsed true
                           :groups-collapsed true
                           :dates-collapsed true}))

(defn main-panel []
  [:div.row
   [:div.col-md-auto]
    ;(dates-block :dates-collapsed)
    ;(geo-zones-block :geo-zones-collapsed)
    ;(groups-block :groups-collapsed)]
   [:div.col
    ;(status-bar)
    [:div "Графики"]]])
