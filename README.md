# pik-logistic-charts

## Create

```
lein new figwheel pik-logistic-charts -- --reagent
```

## Dev

```
lein do clean, with-profile dev figwheel
-or-
lein cooper
```

## Prod

```
lein do clean, with-profile prod cljsbuild once
```
