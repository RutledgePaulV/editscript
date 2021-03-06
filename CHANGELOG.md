# Change Log

## [0.3.2] - 2018-5-31
### Added
- `combine` function to combine two editscripts
- package.json for npm publising [Andrea Richiardi]
### Fixed
- Fix a cljs warning
- Minor speed improvement

## [0.3.1] - 2018-05-09
### Fixed
- Revert heuristic change in 0.3.0, which breaks optimality

## [0.3.0] - 2018-05-09
### Changed
- cljc version
- Simplify heuristic
- Use defn in place of declare, see http://dev.clojure.org/jira/browse/CLJS-1871

## [0.2.4] - 2018-05-05
### Changed
- Expand the use of quick algorithm in `A*` to cases where one party contains only leaves
- Implements pairing heap for priority queue

### Removed
- java.util.PriorityQueue and HashMap as dependency

### Fixed
- Wrong test ns declaration preventing `lein test`

## [0.2.3] - 2018-05-03
### Changed
- `A*` uses quick algorithm for all leaves list/vector comparison
- Quick algorithm aggressively converts replacement

## [0.2.2] - 2018-05-02
### Changed
- `A*` uses global order number for heuristic

## [0.2.1] - 2018-04-30
### Changed
- Developed an `A*` algorithm for diffing

### Removed
- clojure.data.priority-map as a dependency

### Fixed
- all tests passing

## 0.1.1 - 2018-03-04
### Added
- Initial commits
