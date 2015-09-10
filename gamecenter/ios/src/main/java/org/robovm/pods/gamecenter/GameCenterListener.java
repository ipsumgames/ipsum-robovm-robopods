package org.robovm.pods.gamecenter;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.gamekit.GKAchievement;
import org.robovm.apple.gamekit.GKLeaderboard;

import java.util.ArrayList;

/**
 * Listener for GameCenter events
 */
public interface GameCenterListener {

    void playerLoginCompleted();

    void playerLoginFailed(NSError error);

    void achievementReportCompleted();

    void achievementReportFailed(NSError error);

    void achievementsLoadCompleted(ArrayList<GKAchievement> achievements);

    void achievementsLoadFailed(NSError error);

    void achievementsResetCompleted();

    void achievementsResetFailed(NSError error);

    void scoreReportCompleted();

    void scoreReportFailed(NSError error);

    void leaderboardsLoadCompleted(ArrayList<GKLeaderboard> scores);

    void leaderboardsLoadFailed(NSError error);

    void leaderboardViewDismissed();

    void achievementViewDismissed();

}
