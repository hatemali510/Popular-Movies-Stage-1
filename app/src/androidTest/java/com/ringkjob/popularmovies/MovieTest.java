package com.ringkjob.popularmovies;

import android.test.suitebuilder.annotation.SmallTest;

import junit.framework.TestCase;

/**
 * Created by magnus on 24.08.2015.
 */
public class MovieTest extends TestCase {

    @SmallTest
    public void testMovie() throws Exception {
        Movie movieTest = new Movie();

        final String ACTUAL_ORIGINAL_TITLE = "Memento";
        final String ACTUAL_POSTER_PATH = "/fQMSaP88cf1nz4qwuNEEFtazuDM.jpg";
        final String ACTUAL_OVERVIEW = "Suffering short-term memory loss after a head injury, Leonard Shelby embarks on a grim quest to find the lowlife who murdered his wife in this gritty, complex thriller that packs more knots than a hangman's noose. To carry out his plan, Shelby snaps Polaroids of people and places, jotting down contextual notes on the backs of photos to aid in his search and jog his memory. He even tattoos his own body in a desperate bid to remember.";
        final Double ACTUAL_VOTE_AVERAGE = 7.7;
        final String ACTUAL_RELEASE_DATE = " 2001-03-16";

        movieTest.setOriginalTitle(ACTUAL_ORIGINAL_TITLE);
        movieTest.setPosterPath(ACTUAL_POSTER_PATH);
        movieTest.setOverview(ACTUAL_OVERVIEW);
        movieTest.setVoteAverage(ACTUAL_VOTE_AVERAGE);
        movieTest.setReleaseDate(ACTUAL_RELEASE_DATE);


        final String EXPECTED_POSTER_PATH = "https://image.tmdb.org/t/p/w185" + ACTUAL_POSTER_PATH;
        final String EXPECTED_VOTE_AVERAGE_DETAILED = "7.7/10";

        assertEquals(ACTUAL_ORIGINAL_TITLE, movieTest.getOriginalTitle());
        assertEquals(EXPECTED_POSTER_PATH, movieTest.getPosterPath());
        assertEquals(ACTUAL_OVERVIEW, movieTest.getOverview());
        assertEquals(ACTUAL_VOTE_AVERAGE, movieTest.getVoteAverage());
        assertEquals(EXPECTED_VOTE_AVERAGE_DETAILED, movieTest.getDetailedVoteAverage());
        assertEquals(ACTUAL_RELEASE_DATE, movieTest.getReleaseDate());
    }

    @SmallTest
    public void testMovie_OverloadedConstructor() {
        final String ACTUAL_ORIGINAL_TITLE = "The Shawshank Redemption";
        final String ACTUAL_POSTER_PATH = "/9O7gLzmreU0nGkIB6K3BsJbzvNv.jpg";
        final String ACTUAL_OVERVIEW = "Framed in the 1940s for the double murder of his wife and her lover, upstanding banker Andy Dufresne begins a new life at the Shawshank prison, where he puts his accounting skills to work for an amoral warden. During his long stretch in prison, Dufresne comes to be admired by the other inmates -- including an older prisoner named Red -- for his integrity and unquenchable sense of hope.";
        final Double ACTUAL_VOTE_AVERAGE = 8.2;
        final String ACTUAL_RELEASE_DATE = "1994-09-14";

        final String EXPECTED_POSTER_PATH = "https://image.tmdb.org/t/p/w185" + ACTUAL_POSTER_PATH;
        final String EXPECTED_VOTE_AVERAGE_DETAILED = "8.2/10";

        Movie movieTest = new Movie(ACTUAL_ORIGINAL_TITLE,
                ACTUAL_POSTER_PATH, ACTUAL_OVERVIEW,
                ACTUAL_VOTE_AVERAGE, ACTUAL_RELEASE_DATE);


        assertEquals(ACTUAL_ORIGINAL_TITLE, movieTest.getOriginalTitle());
        assertEquals(EXPECTED_POSTER_PATH, movieTest.getPosterPath());
        assertEquals(ACTUAL_OVERVIEW, movieTest.getOverview());
        assertEquals(ACTUAL_VOTE_AVERAGE, movieTest.getVoteAverage());
        assertEquals(EXPECTED_VOTE_AVERAGE_DETAILED, movieTest.getDetailedVoteAverage());
        assertEquals(ACTUAL_RELEASE_DATE, movieTest.getReleaseDate());
    }
}