(ns pik-logistic-charts.core
    (:require [reagent.core :as r]
              [re-frame.core :as rf]
              [pik-logistic-charts.config :as config]
              [pik-logistic-charts.events :as events]
              [pik-logistic-charts.views :as views]))

(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))


(defn mount-root []
  (rf/clear-subscription-cache!)
  (r/render [views/main-panel]
            (.getElementById js/document "app")))


(defn ^:export init []
  (rf/dispatch-sync [::events/init-db])
  (rf/dispatch-sync [::events/init-load-data])
  (dev-setup)
  (mount-root))
